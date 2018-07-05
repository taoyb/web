package com.taoyb.simon.web.service;


import com.taoyb.simon.common.base.BaseDao;
import com.taoyb.simon.common.utils.Pager;
import com.taoyb.simon.web.model.TybRecord;
import com.taoyb.simon.web.utils.AjaxDone;

/**
 * Created by taoyb on 2016-12-05.
 */
public interface TybRecordService extends BaseDao<TybRecord,Long> {
    Pager<TybRecord> findAllRecords(TybRecord record, Integer pageNum, Integer pageSize);
    AjaxDone saveRecord(TybRecord record, String nav);
    AjaxDone delRecord(Long rid);
}
