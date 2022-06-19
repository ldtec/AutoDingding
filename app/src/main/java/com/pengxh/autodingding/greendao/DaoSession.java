package com.pengxh.autodingding.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.pengxh.autodingding.bean.DingTaskLogBean;
import com.pengxh.autodingding.bean.HistoryRecordBean;
import com.pengxh.autodingding.bean.NotificationBean;

import com.pengxh.autodingding.greendao.DingTaskLogBeanDao;
import com.pengxh.autodingding.greendao.HistoryRecordBeanDao;
import com.pengxh.autodingding.greendao.NotificationBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dingTaskLogBeanDaoConfig;
    private final DaoConfig historyRecordBeanDaoConfig;
    private final DaoConfig notificationBeanDaoConfig;

    private final DingTaskLogBeanDao dingTaskLogBeanDao;
    private final HistoryRecordBeanDao historyRecordBeanDao;
    private final NotificationBeanDao notificationBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dingTaskLogBeanDaoConfig = daoConfigMap.get(DingTaskLogBeanDao.class).clone();
        dingTaskLogBeanDaoConfig.initIdentityScope(type);

        historyRecordBeanDaoConfig = daoConfigMap.get(HistoryRecordBeanDao.class).clone();
        historyRecordBeanDaoConfig.initIdentityScope(type);

        notificationBeanDaoConfig = daoConfigMap.get(NotificationBeanDao.class).clone();
        notificationBeanDaoConfig.initIdentityScope(type);

        dingTaskLogBeanDao = new DingTaskLogBeanDao(dingTaskLogBeanDaoConfig, this);
        historyRecordBeanDao = new HistoryRecordBeanDao(historyRecordBeanDaoConfig, this);
        notificationBeanDao = new NotificationBeanDao(notificationBeanDaoConfig, this);

        registerDao(DingTaskLogBean.class, dingTaskLogBeanDao);
        registerDao(HistoryRecordBean.class, historyRecordBeanDao);
        registerDao(NotificationBean.class, notificationBeanDao);
    }
    
    public void clear() {
        dingTaskLogBeanDaoConfig.clearIdentityScope();
        historyRecordBeanDaoConfig.clearIdentityScope();
        notificationBeanDaoConfig.clearIdentityScope();
    }

    public DingTaskLogBeanDao getDingTaskLogBeanDao() {
        return dingTaskLogBeanDao;
    }

    public HistoryRecordBeanDao getHistoryRecordBeanDao() {
        return historyRecordBeanDao;
    }

    public NotificationBeanDao getNotificationBeanDao() {
        return notificationBeanDao;
    }

}
