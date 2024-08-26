package com.fei.base.rpc.facade.feign;

import com.fei.base.rpc.facade.request.DemoRequest;
import com.fei.base.rpc.facade.result.DemoResult;
import com.mengxiang.base.common.model.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author fei
 * @date 2020 09-22 16:16
 **/
@FeignClient(name = "pay_ser_stub")
public interface DemoFacade {

    /**
     * 获取 demo
     *
     * @param demoId demo id
     * @return
     */
    @PostMapping(path = "/pay_ser_stub/getDemo")
    Result<DemoResult> getDemo(@RequestParam("demoId") String demoId);

    /**
     * 新增 demo
     *
     * @param dto dto对象
     * @return pay_ser_stubId
     */
    @PostMapping(path = "/pay_ser_stub/addDemo")
    Result<String> addDemo(@RequestBody DemoRequest dto);
}