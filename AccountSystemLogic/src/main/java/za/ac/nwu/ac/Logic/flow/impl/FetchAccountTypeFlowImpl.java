package za.ac.nwu.ac.Logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.Logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        return accountTypeTranslator.getAllAccountTypes();
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic){
        return accountTypeTranslator.getAccountTypeDtoByMnemonic(mnemonic);
    }

    @Override
    public AccountType getAccountTypeDbEntityByMnemonic(String mnemonic) {
        return accountTypeTranslator.getAccountTypeDbEntityByMnemonic(mnemonic);
    }

    public boolean methodToTest(){
        return true;
    }
}
