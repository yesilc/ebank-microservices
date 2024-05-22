package com.yesil.account.service;

import com.yesil.account.dto.CustomerDto;

/**
 * The interface Account service.
 */
public interface IAccountService {


    /**
     * Create account.
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetch account customer dto.
     *
     * @param mobileNumber the mobile number
     * @return the customer dto
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Update account boolean.
     *
     * @param customerDto the customer dto
     * @return the boolean
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Delete account boolean.
     *
     * @param mobileNumber the mobile number
     * @return the boolean
     */
    boolean deleteAccount(String mobileNumber);
}
