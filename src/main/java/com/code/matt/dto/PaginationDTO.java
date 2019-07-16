package com.code.matt.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ming
 * @Date: Created in    19-7-13 下午1:33
 * @Description:
 * @Modified: By
 */
@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;

        page= (page<1)?1:(page>totalPage)?totalPage:page;
        this.page = page;

        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0,page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }

        showPrevious = (page != 1);
        showNext = (page != totalPage);

        showFirstPage = (!pages.contains(1));
        showEndPage = (!pages.contains(totalPage));

    }
}
