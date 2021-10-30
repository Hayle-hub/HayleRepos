package com.hg.flooringmastery.dao;

import com.hg.flooringmastery.dao.FlooringAuditDao;
import com.hg.flooringmastery.dao.FlooringPersistenceException;

public class FlooringAuditDaoStubImpl implements FlooringAuditDao {
    @Override
    public void writeAuditEntry(String entry) throws FlooringPersistenceException {
        /// do nothing...
    }
}
