package com.botcamp.shoppingcart;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class QueryTest {

	@PersistenceContext
	EntityManager em;
	
	@Before
	public void setUp() throws Exception {
	}

    @Test
    public final void whenContextIsBootstrapped_thenNoExceptions() {
        
    }

}
