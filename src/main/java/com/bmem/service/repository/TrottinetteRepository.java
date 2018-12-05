/**
 * 
 */
package com.bmem.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bmem.service.models.Trottinette;

/**
 * @author ramzy
 *
 */
@RepositoryRestResource
public interface TrottinetteRepository extends JpaRepository<Trottinette, Long>{

}
