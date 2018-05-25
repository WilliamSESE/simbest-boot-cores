/*
 * 版权所有 © 北京晟壁科技有限公司 2008-2027。保留一切权利!
 */
package com.simbest.boot.security.auth.model;

import com.simbest.boot.base.model.LogicModel;
import lombok.*;

import javax.persistence.*;

/**
 * <strong>Description : 人员权限信息</strong><br>
 * <strong>Create on : 2017年08月23日</strong><br>
 * <strong>Modify on : 2017年11月08日</strong><br>
 * <strong>Copyright Beijing Simbest Technology Ltd.</strong><br>
 *
 * @author lishuyi
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SysUserPermission extends LogicModel {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "sys_user_permission_seq", sequenceName = "sys_user_permission_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sys_user_permission_seq")
    private Integer id;

    @NonNull
    private String username;

    @NonNull
    private Integer permissionId;

}
