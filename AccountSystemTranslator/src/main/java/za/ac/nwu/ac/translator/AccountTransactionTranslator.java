package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.persistence.AccountTransaction;

import java.util.List;

public interface AccountTransactionTranslator {
    AccountTransaction save(AccountTransaction accountTransaction);

    List<AccountTransaction> getAllAccountTransactions();

    AccountTransaction getAccountTransactionByPk(Long transactionId);
}
