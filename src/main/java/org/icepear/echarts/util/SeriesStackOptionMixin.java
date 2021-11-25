package org.icepear.echarts.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1701
 */
public interface SeriesStackOptionMixin {
    @Getter
    @Setter
    public String stack = null;
}