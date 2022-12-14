package com.bazra.usermanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazra.usermanagement.model.AddressElement;
import com.bazra.usermanagement.model.UserAddress;
import com.bazra.usermanagement.model.UserInfo;
@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {
//	Optional<UserAddress> findByuser(UserInfo userInfo);
	List<UserAddress> findByuser(UserInfo userInfo);

}
