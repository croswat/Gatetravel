package croswat.GateTravel;

import GateTravel.item.GateTravelItems;
import croswat.GateTravel.block.GateTravelBlocks;
import croswat.GateTravel.core.GatesWorldGen;
import croswat.GateTravel.core.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = "croswat_GateTravel", name = "GateTravel", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class GateTravel 
{
	@Instance("Gate_Travel")
    public static GateTravel instance;
	@SidedProxy(clientSide="croswat.gateTravel.proxy.ClientProxy", serverSide="croswat.gateTravel.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static GatesWorldGen worldGen = new GatesWorldGen(); // world generation
	
	@PreInit
    public void preInit(FMLPreInitializationEvent event) {
            // read config files here
    }
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		GateTravelBlocks.init();
		GateTravelItems.init();
		//world gen
		
	}
	
	
	@PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // work with other mods goes here
    }
}
