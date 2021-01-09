
package net.yazouv.skyfacmod.creativetab;

import net.yazouv.skyfacmod.block.BlockSkyluckyblock;
import net.yazouv.skyfacmod.ElementsSkyfacmodMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSkyfacmodMod.ModElement.Tag
public class TabSkylucky extends ElementsSkyfacmodMod.ModElement {
	public TabSkylucky(ElementsSkyfacmodMod instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabskylucky") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockSkyluckyblock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
