package by.academy.it.task08.dao.factory;

import by.academy.it.task08.dao.AddressDao;
import by.academy.it.task08.dao.PeopleDao;

/**
 *
 */
public interface DaoFactory {
    /**
     *
     */
    enum PersistenceUnit {
        /**
         *
         */
        PRODUCTION("production"),
        /**
         *
         */
        TEST("test");
        /**
         *
         */
        private String persistenceUtitName;

        PersistenceUnit(final String pun) {
            this.persistenceUtitName = pun;
        }

        /**
         * @return -
         */
        public String getPersistenceUtitName() {
            return persistenceUtitName;
        }
    }

    /**
     * @return -
     */
    AddressDao getAddressDao();

    /**
     * @return -
     */
    PeopleDao getPeopleDao();
}
