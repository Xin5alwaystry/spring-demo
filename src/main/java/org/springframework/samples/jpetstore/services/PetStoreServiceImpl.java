package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.jpa.JpaAccountDao;
import org.springframework.samples.jpetstore.dao.jpa.JpaItemDao;

/**
 * @author xin5
 * @since 2023年01月07日 09:50:31
 */
public class PetStoreServiceImpl {
    private JpaAccountDao accountDao;
    private JpaItemDao itemDao;


    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
