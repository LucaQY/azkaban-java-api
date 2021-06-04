package com.rouchi.controller;

import com.rouchi.api.AzkabanApi;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.rouchi.config.InterfaceComment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

/*
 */
/**
 *
 * @param
 * @return
 *//*

    @SuppressWarnings("unchecked")
    @ApiOperation(value = "通过用户画像标签获取用户uniqueID", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = Map.class)
    @ApiImplicitParams(
            { @ApiImplicitParam(name = "returnID", value = "返回ID的名称", dataType = "String"),
                    @ApiImplicitParam(name = "lableJson", value = "用户标签JSON", dataType = "String")
            })
    @RequestMapping(value = InterfaceComment.PORTRAIT_BACKEND_UIDBYLABLE, method = RequestMethod.POST, produces = "application/json")
//    @MonitorTimes(type = ProjectConstants.BACKENDNAME)
    @ResponseBody
    public ResponseEntity<Object> getIdJsonByJid(String returnID, String lableJson) {

        if (returnID.isEmpty() || lableJson.isEmpty()){
            return super.fieldException(ErrorCodeEnum.PROPERTY_PARAMETER_NULL);
        }
        String reqLable;

        try {
            reqLable = URLDecoder.decode(lableJson,"utf8");
            logger.info( "**********reqLable: \t" + reqLable);
        } catch ( UnsupportedEncodingException e ){
            e.printStackTrace();
            return super.fieldException(ErrorCodeEnum.PROPERTY_PARAMETER_URLDECODE_FAILURE);
        }

        if (JsonUtil.validateJson(reqLable) && !JsonUtil.isEmpty(reqLable)) {
            return super.responseMsg(portraitBackendService.getIdJsonByJid(returnID,reqLable));
        } else {
            return super.fieldException(ErrorCodeEnum.PROPERTY_PARAMETER_JSON_PARSE_FAILURE);
        }

    }
*/







@Api(value = "AzkabanController", tags = { "AzkabanController" })
@RestController
@RequestMapping(InterfaceComment.API)
public class AzkabanController {

    public static Logger logger = LoggerFactory.getLogger(AzkabanController.class);

    @Autowired
    private AzkabanApi azkabanApi;










}
