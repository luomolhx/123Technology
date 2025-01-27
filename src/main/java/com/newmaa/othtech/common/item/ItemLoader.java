package com.newmaa.othtech.common.item;

import net.minecraft.item.Item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemLoader {

    public static Item LookNEIdust = new LookNEIdust();
    public static Item dustIrOsSm = new dustIrOsSm();
    public static Item itemZhangww = new itemZhangww();
    public static Item ingotHotDog = new ingotHotDog();
    public static Item itemLeekBox = new itemLeekBox();
    public static Item ingotDog = new ingotDog();
    public static Item singularity1 = new singularity1();
    public static Item singularity2 = new singularity2();
    public static Item Dasima = new Dasima();
    public static Item ShikanokoNoko = new ShikanokoNoko();
    public static Item dustSnAs = new dustSnAs();
    public static Item ingotSnAs = new ingotSnAs();
    public static Item IsaBee = new IsaBee();
    public static Item MagBee = new MagBee();
    public static Item socCosmic = new socCosmic();
    public static Item socInf = new socInf();
    public static Item socNor = new socNor();
    public static Item boardTrans = new boardTrans();
    public static Item capTrans = new capTrans();
    public static Item transTrans = new transTrans();
    public static Item induTrans = new induTrans();
    public static Item resTrans = new resTrans();
    public static Item dioTrans = new dioTrans();
    public static Item leCasimir = new leCasimir();
    public static Item finCasimir = new finCasimir();
    public static Item boardCasimir = new boardCasimir();
    public static Item energyHatchSpacetime = new energyHatchSpacetime();
    public static Item itemEnqing = new itemEnqing();
    public static Item itemSunLighter = new itemSunLighter();
    public static Item itemNukeThrowable = new itemNukeThrowable();

    public ItemLoader(FMLPreInitializationEvent event) {
        IRegistry(LookNEIdust, "LookNEIdust");
        IRegistry(dustIrOsSm, "dustIrOsSm");
        IRegistry(itemZhangww, "itemZhangww");
        IRegistry(ingotHotDog, "ingotHotDog");
        IRegistry(ingotDog, "ingotDog");
        IRegistry(singularity1, "singularity1");
        IRegistry(singularity2, "singularity2");
        IRegistry(Dasima, "Dasima");
        IRegistry(ShikanokoNoko, "ShikanokoNoko");
        IRegistry(dustSnAs, "dustSnAs");
        IRegistry(ingotSnAs, "ingotSnAs");
        IRegistry(IsaBee, "IsaBee");
        IRegistry(MagBee, "MagBee");
        IRegistry(socCosmic, "socCosmic");
        IRegistry(socInf, "socInf");
        IRegistry(socNor, "socNor");
        IRegistry(boardTrans, "boardTrans");
        IRegistry(capTrans, "capTrans");
        IRegistry(transTrans, "transTrans");
        IRegistry(induTrans, "induTrans");
        IRegistry(resTrans, "resTrans");
        IRegistry(dioTrans, "dioTrans");
        IRegistry(leCasimir, "leCasimir");
        IRegistry(finCasimir, "finCasimir");
        IRegistry(boardCasimir, "boardCasimir");
        IRegistry(energyHatchSpacetime, "energyHatchSpacetime");
        IRegistry(itemEnqing, "itemEnqing");
        IRegistry(itemSunLighter, "itemSunLighter");
        IRegistry(itemLeekBox, "itemLeekBox");
        IRegistry(itemNukeThrowable, "itemNukeThrowable");
    }

    private static void IRegistry(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

}
