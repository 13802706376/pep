package yunnex.pep.biz.sys.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import yunnex.pep.common.base.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 机构表 PageRespDto
 *
 * @author 政经平台
 * @since 2018-10-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ToString(callSuper = true)
@ApiModel(value="机构表分页响应DTO", description="机构表")
public class SysOfficePageRespDto extends BaseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "父级编号")
    private String parentId;

    @ApiModelProperty(value = "所有父级编号")
    private String parentIds;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "归属区域")
    private String areaId;

    @ApiModelProperty(value = "区域编码")
    private String code;

    @ApiModelProperty(value = "机构类型")
    private String type;

    @ApiModelProperty(value = "机构等级")
    private String grade;

    @ApiModelProperty(value = "LDAP DN")
    private String ldapDn;

    @ApiModelProperty(value = "是否启用")
    private String useAble;
   
    @ApiModelProperty(value = "部门人数")
    private int  userCount;

}
