package za.ac.nwu.ac.Logic.flow;


import za.ac.nwu.ac.domain.dto.AccountTransactionDto;

public interface CreateAccountTransactionFlow {
    AccountTransactionDto create(AccountTransactionDto accountTransaction);
}
