/**
 * 
 */
package com.rbs.breach.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbs.breach.entity.BreachApplication;

/**
 * @author user
 *
 */
public interface BreachApplicationRepository extends JpaRepository<BreachApplication, UUID> {

}
