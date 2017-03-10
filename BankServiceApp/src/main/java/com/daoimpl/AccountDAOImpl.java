/**
 * 
 */
package com.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.dao.AccountDAO;
import com.pojo.Account;

/**
 * @author prasal
 *
 */
@Repository
public class AccountDAOImpl implements AccountDAO {

	@PersistenceContext
	private EntityManager entityManager;

	

	@Override
	@Transactional
	public void saveAccountInfo(Account account) {
		// TODO Auto-generated method stub
		
		try {
			
			entityManager.persist(account);
		} finally {
			// TODO: handle finally clause
			entityManager.close();
		}
	}	
	
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
}
