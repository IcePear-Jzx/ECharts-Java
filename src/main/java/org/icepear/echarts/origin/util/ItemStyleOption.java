package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L971
 */
public interface ItemStyleOption extends ShadowOptionMixin, BorderOptionMixin {

	ItemStyleOption setColor(String color);

	ItemStyleOption setOpacity(Number opacity);

	ItemStyleOption setDecal(Object decal);

	ItemStyleOption setDecal(String decal);
}
