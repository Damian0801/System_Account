package za.ac.nwu.ac.Logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;


public interface CreateAccountTypeFlow {
    AccountTypeDto create(AccountTypeDto accountType);
}
