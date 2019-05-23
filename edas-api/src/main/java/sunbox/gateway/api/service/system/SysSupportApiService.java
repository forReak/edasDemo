package sunbox.gateway.api.service.system;

import feign.Headers;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;
import sunbox.api.model.ResponseVo;
import sunbox.gateway.api.model.system.*;

public interface SysSupportApiService {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/login")
    ResponseVo login(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/logout")
    ResponseVo logout(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/checkToken")
    ResponseVo checkToken(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getLoginOperator")
    ResponseVo getLoginOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/queryOperator")
    ResponseVo queryOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/addOperator")
    ResponseVo addOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/updateOperator")
    ResponseVo updateOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/delOperator")
    ResponseVo delOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/authOperatorBiz")
    ResponseVo authOperatorBiz(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getOperatorBizLabels")
    ResponseVo getOperatorBizLabels(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/resetOperatorPwd")
    ResponseVo resetOperatorPwd(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/changeOperatorPwd")
    ResponseVo changeOperatorPwd(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/forzenOperator")
    ResponseVo forzenOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/unfreezeOperator")
    ResponseVo unfreezeOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/auditOperator")
    ResponseVo auditOperator(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/addOpRole")
    ResponseVo addOpRole(@RequestBody OpRoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/deleteOpRole")
    ResponseVo deleteOpRole(@RequestBody OpRoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/checkOpRole")
    ResponseVo checkOpRole(@RequestBody OpRoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getOpRoleMessage")
    ResponseVo getOpRoleMessage(@RequestBody OpRoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/addRole")
    ResponseVo addRole(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/updateRole")
    ResponseVo updateRole(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/deleteRole")
    ResponseVo deleteRole(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getSingleRole")
    ResponseVo getSingleRole(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getRoleListByCondition")
    ResponseVo getRoleListByCondition(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/setRoleFunc")
    ResponseVo setRoleFunc(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getRoleFunc")
    ResponseVo getRoleFunc(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getRoleInfoByToken")
    ResponseVo getRoleInfoByToken(@RequestBody RoleModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getRoleInfoByOperatorId")
    ResponseVo getRoleInfoByOperatorId(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/addFunc")
    ResponseVo addFunc(@RequestBody FuncModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/updateFunc")
    ResponseVo updateFunc(@RequestBody FuncModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/deleteFunc")
    ResponseVo deleteFunc(@RequestBody FuncModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getSingleFunc")
    ResponseVo getSingleFunc(@RequestBody FuncModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/queryFuncListByCondition")
    ResponseVo queryFuncListByCondition(@RequestBody FuncModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/queryOperatorList")
    ResponseVo queryOperatorList(@RequestBody OperatorItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getSingleOrgByOuCode")
    ResponseVo getSingleOrgByOuCode(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getSysOrgsByPOuCode")
    ResponseVo getSysOrgsByPOuCode(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getSysOrgsByParentOuCode")
    ResponseVo getSysOrgsByParentOuCode(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getAllSysOrgsByPOuCode")
    ResponseVo getAllSysOrgsByPOuCode(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/addSysOrg")
    ResponseVo addSysOrg(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/modifySysOrg")
    ResponseVo modifySysOrg(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/deleteSysOrg")
    ResponseVo deleteSysOrg(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getSysOrgsByPOuCode_new")
    ResponseVo getSysOrgsByPOuCode_new(@RequestBody OrganizationItemModel var1);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("POST /api/api/sys_support_api/getSysDictByAlias")
    ResponseVo getSysDictByAlias(@RequestBody DictModel var1);
}
