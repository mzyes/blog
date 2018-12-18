package xyz.yescn.blog.dto;



/**
 * @author issuser
 */
public class CategoryDto{
    /**
     * 日志分类ID
     */
    private Long id;
    /**
     * 日志分类名称
     */
    private String name;
    /**
     * 日志分类创建时间
     */
    private String createTime;
    /**
     * 日志分类排序
     */
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}