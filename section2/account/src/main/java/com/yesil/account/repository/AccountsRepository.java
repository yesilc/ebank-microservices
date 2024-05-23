package com.yesil.account.repository;

import com.yesil.account.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    //name convention
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
    /*
Previously we are only trying to read the data.
It is not going to change the data in any way, but whenever you are trying to update or delete with
the custom methods that you have written, we need to make sure we are mentioning two annotations on
top of these abstract methods. These two annotations are @Transactional and the second annotation is @Modifying.
Modifying will tell to the spring data JPA framework that these method is going to modify the data. So that's why
please execute the query of this method inside a Transaction. That's why we are mentioning Transactional annotation.
When my spring data JPA runs my query inside a Transaction and if there is some error happens at the runtime, any
partial change of data that is resulted due to the queries will be rolled back because the entire transaction will be
rolled back by the spring data JPA and we are in safe hands.
*/
}
