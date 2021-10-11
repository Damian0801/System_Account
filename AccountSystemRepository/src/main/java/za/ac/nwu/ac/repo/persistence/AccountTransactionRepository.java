package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {
    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE AccountTransaction at SET "+
            "at.amount = at.amount + :amount "+
            "WHERE at.memberId = :memberId")
    Integer addMilesToMilesAccount(Long amount, Long memberId);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE AccountTransaction at SET "+
            "at.amount = at.amount - :amount "+
            "WHERE at.memberId = :memberId")
    Integer subtractMilesFromMilesAccount(Long amount, Long memberId);



}
