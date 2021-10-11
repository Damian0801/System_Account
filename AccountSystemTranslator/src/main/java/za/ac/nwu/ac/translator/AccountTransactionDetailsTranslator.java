package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;

public interface AccountTransactionDetailsTranslator {
    AccountTransactionDetails save(AccountTransactionDetails accountTransactionDetails);
}
