/**
 * 
 */
package com.pension.pensiondetailsmodule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pension.pensiondetailsmodule.model.PensionDetails;

/**
 * @author SAYANDIP PAUL
 *
 */
@Repository
public interface PensionDetailsRepository extends JpaRepository<PensionDetails, Long>{

	public List<PensionDetails> findById(long aadhaar);
}
