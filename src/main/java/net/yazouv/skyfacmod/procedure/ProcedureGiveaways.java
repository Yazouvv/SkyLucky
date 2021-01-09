package net.yazouv.skyfacmod.procedure;

import net.yazouv.skyfacmod.ElementsSkyfacmodMod;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import java.util.Map;

@ElementsSkyfacmodMod.ModElement.Tag
public class ProcedureGiveaways extends ElementsSkyfacmodMod.ModElement {
	public ProcedureGiveaways(ElementsSkyfacmodMod instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Giveaways!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Giveaways!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Giveaways!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Giveaways!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Giveaways!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 1)) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Vous avez re\u00E7u 250 $"), (true));
			}
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.firework.launch")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
					_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
						@Override
						public String getName() {
							return "";
						}

						@Override
						public boolean canUseCommand(int permission, String command) {
							return true;
						}

						@Override
						public World getEntityWorld() {
							return _ent.world;
						}

						@Override
						public MinecraftServer getServer() {
							return _ent.world.getMinecraftServer();
						}

						@Override
						public boolean sendCommandFeedback() {
							return false;
						}

						@Override
						public BlockPos getPosition() {
							return _ent.getPosition();
						}

						@Override
						public Vec3d getPositionVector() {
							return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
						}

						@Override
						public Entity getCommandSenderEntity() {
							return _ent;
						}
					}, "eco give 250 ");
				}
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		} else {
			if ((Math.random() < 100)) {
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Vous avez re\u00E7u 1 block de skylite $"), (true));
				}
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
						_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
							@Override
							public String getName() {
								return "";
							}

							@Override
							public boolean canUseCommand(int permission, String command) {
								return true;
							}

							@Override
							public World getEntityWorld() {
								return _ent.world;
							}

							@Override
							public MinecraftServer getServer() {
								return _ent.world.getMinecraftServer();
							}

							@Override
							public boolean sendCommandFeedback() {
								return false;
							}

							@Override
							public BlockPos getPosition() {
								return _ent.getPosition();
							}

							@Override
							public Vec3d getPositionVector() {
								return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
							}

							@Override
							public Entity getCommandSenderEntity() {
								return _ent;
							}
						}, "give minecraft:stick");
					}
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("entity.firework.launch")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			} else {
				if ((Math.random() < 50)) {
					world.playSound((EntityPlayer) null, x, y, z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("ambient.cave")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				} else {
					if ((Math.random() < 40)) {
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("entity.firework.launch")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					} else {
						if ((Math.random() < 30)) {
							world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
									.getObject(new ResourceLocation("entity.firework.launch")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						} else {
							if ((Math.random() < 20)) {
								world.playSound((EntityPlayer) null, x, y, z,
										(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
												.getObject(new ResourceLocation("entity.firework.launch")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
							} else {
								if ((Math.random() < 10)) {
									world.playSound((EntityPlayer) null, x, y, z,
											(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
													.getObject(new ResourceLocation("entity.firework.launch")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1);
									world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
