package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.translator.AccountTypeTranslator;
import za.ac.nwu.ac.repo.persistence.AccountTypeRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@ComponentScan(basePackages ={
        "za.ac.nwu.ac.repo"
})
public class AccountTypeTranslatorImpl implements AccountTypeTranslator {

    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        try {
            for (AccountType accountType : accountTypeRepository.findAll()) {
                accountTypeDtos.add(new AccountTypeDto(accountType));
            }
        } catch (Exception e) {
            //TODO: Log
            throw new RuntimeException("Unable to read from the DB", e);
        }

        return accountTypeDtos;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountTypeDto){

        try {
            AccountType accountType = accountTypeRepository.save(accountTypeDto.getAccountType());
            return new AccountTypeDto(accountType);
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to the DB", e);
        }
    }

    @Override
    public AccountTypeDto save(AccountType accountType){
        try{
            return new AccountTypeDto(accountTypeRepository.save(accountType));
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to the DB", e);
        }
    }

    @Override
    public AccountTypeDto getAccountTypesByMnemonicNativeQuery(String mnemonic){
        try{
            AccountType accountType = accountTypeRepository.getAccountTypeByMnemonicNativeQuery(mnemonic);
            return new AccountTypeDto(accountType);
        }catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic){
        try{
            AccountType accountType = accountTypeRepository.getAccountTypeByMnemonic(mnemonic);
            return new AccountTypeDto(accountType);
        }catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }

    @Override
    public AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic){
        try{
            return accountTypeRepository.getAccountTypeDtoByMnemonic(mnemonic);
        }catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }

   @Override
    public void someMethod() {

    }

    @Override
    public AccountType getAccountTypeDbEntityByMnemonic(String mnemonic) {
        try{
            return accountTypeRepository.getAccountTypeDbEntityByMnemonic(mnemonic);
        }catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }
}