package com.discord.app_icon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/discord/app_icon/AppIcon;", "", "id", "", "aliasSuffix", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "alias", "getAlias", "()Ljava/lang/String;", "getId", "DEFAULT", "BRAND_INVERTED", "BRAND_DARK", "MATTE_LIGHT", "MATTE_DARK", "PASTEL", "PIRATE", "CAMO", "SUNSET", "GALAXY", "Y2K", "CHERRY_BLOSSOM", "BEANIE", "GAMING", "CIRCUIT", "HOLO_WAVES", "BLUSH", "ANGRY", "MANGA", "CONTROLLER", "MUSHROOM", "ZOMBIE", "CLYDESTEIN", "SLIMY", "Drip", "app_icon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum AppIcon {
    DEFAULT("AppIcon", "MainDefault"),
    BRAND_INVERTED("BrandInvertedIcon", "MainBrandInverted"),
    BRAND_DARK("BrandDarkIcon", "MainBrandDark"),
    MATTE_LIGHT("MatteLightIcon", "MainMatteLight"),
    MATTE_DARK("MatteDarkIcon", "MainMatteDark"),
    PASTEL("PastelIcon", "MainPastel"),
    PIRATE("PirateIcon", "MainPirate"),
    CAMO("CamoIcon", "MainCamo"),
    SUNSET("SunsetIcon", "MainSunset"),
    GALAXY("GalaxyIcon", "MainGalaxy"),
    Y2K("Y2KIcon", "MainY2K"),
    CHERRY_BLOSSOM("CherryBlossomIcon", "MainCherryBlossom"),
    BEANIE("BeanieIcon", "MainBeanie"),
    GAMING("GamingIcon", "MainGaming"),
    CIRCUIT("CircuitIcon", "MainCircuit"),
    HOLO_WAVES("HoloWavesIcon", "MainHoloWaves"),
    BLUSH("BlushIcon", "MainBlush"),
    ANGRY("AngryIcon", "MainAngry"),
    MANGA("MangaIcon", "MainManga"),
    CONTROLLER("ControllerIcon", "MainController"),
    MUSHROOM("MushroomIcon", "MainMushroom"),
    ZOMBIE("ZombieIcon", "MainZombie"),
    CLYDESTEIN("ClydeSteinIcon", "MainClydeStein"),
    SLIMY("SlimyIcon", "MainSlimy"),
    Drip("DripIcon", "MainDrip");
    
    private final String aliasSuffix;

    
    private final String f6871id;

    AppIcon(String str, String str2) {
        this.f6871id = str;
        this.aliasSuffix = str2;
    }

    public final String getAlias() {
        String str = this.aliasSuffix;
        return "com.discord.main." + str;
    }

    public final String getId() {
        return this.f6871id;
    }
}
