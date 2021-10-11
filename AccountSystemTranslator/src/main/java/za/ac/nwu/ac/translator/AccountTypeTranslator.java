package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.time.LocalDate;
import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDto> getAllAccountTypes();

    AccountTypeDto create(AccountTypeDto accountType);

    AccountTypeDto save(AccountType accountType);

    AccountTypeDto getAccountTypesByMnemonicNativeQuery(String mnemonic);

    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);

    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);

    void someMethod();

    AccountType getAccountTypeDbEntityByMnemonic(String mnemonic);
}
