package com.f;
import javax.management.loading.ClassLoaderRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface VEmployeesRepository extends ClassLoaderRepository <VEmployees , String> {
	

}
