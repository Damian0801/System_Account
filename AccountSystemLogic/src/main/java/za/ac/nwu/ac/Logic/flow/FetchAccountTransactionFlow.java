package za.ac.nwu.ac.Logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTransactionDto;

import java.util.List;

public interface FetchAccountTransactionFlow {
    List<AccountTransactionDto> getAllAccountTransactions();

    AccountTransactionDto getAccountTransactionById(Long transactionId);
}
