package com.discord.bridge;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.avatar.react.AvatarPackage;
import com.discord.blur.BlurViewPackage;
import com.discord.chat.ChatPackage;
import com.discord.emoji_picker.react.EmojiPickerPackage;
import com.discord.flipper.FlipperUtils;
import com.discord.react_gesture_handler.DiscordGestureHandlerPackage;
import com.discord.sticker.react.StickerPackage;
import com.discord.sticker_picker.react.StickerPickerPackage;
import com.facebook.react.PackageList;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016¨\u0006\t"}, d2 = {"Lcom/discord/bridge/DCDPackageList;", "Lcom/facebook/react/PackageList;", ZeroconfModule.KEY_SERVICE_HOST, "Lcom/facebook/react/ReactNativeHost;", "(Lcom/facebook/react/ReactNativeHost;)V", "getPackages", "Ljava/util/ArrayList;", "Lcom/facebook/react/ReactPackage;", "Lkotlin/collections/ArrayList;", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DCDPackageList extends PackageList {
    
    public DCDPackageList(ReactNativeHost host) {
        super(host);
        q.h(host, "host");
    }

    @Override 
    public ArrayList<ReactPackage> getPackages() {
        ArrayList<ReactPackage> packages = super.getPackages();
        DCDModuleProvider dCDModuleProvider = DCDModuleProvider.INSTANCE;
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$1.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$2.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$3.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$4.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$5.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$6.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$7.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$8.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$9.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$10.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$11.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$12.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$13.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$14.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$15.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$16.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$17.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$18.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$19.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$20.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$21.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$22.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$23.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$24.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$25.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$26.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$27.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$28.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$29.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$30.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$31.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$32.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$33.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$34.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$35.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$36.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$37.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$38.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$39.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$40.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$41.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$42.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$43.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$44.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$45.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$46.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$47.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$48.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$49.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$50.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$51.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(DCDPackageList$getPackages$52.INSTANCE));
        packages.add(new AvatarPackage());
        packages.add(new BlurViewPackage());
        packages.add(new ChatPackage());
        packages.add(new DiscordGestureHandlerPackage());
        packages.add(new EmojiPickerPackage());
        packages.add(new StickerPackage());
        packages.add(new StickerPickerPackage());
        packages.add(FlipperUtils.INSTANCE.getFlipperPackage());
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(null, DCDPackageList$getPackages$53.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(null, DCDPackageList$getPackages$54.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(null, DCDPackageList$getPackages$55.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(DCDPackageList$getPackages$56.INSTANCE, DCDPackageList$getPackages$57.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(DCDPackageList$getPackages$58.INSTANCE, DCDPackageList$getPackages$59.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(null, DCDPackageList$getPackages$60.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(DCDPackageList$getPackages$61.INSTANCE, DCDPackageList$getPackages$62.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(DCDPackageList$getPackages$63.INSTANCE, DCDPackageList$getPackages$64.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(null, DCDPackageList$getPackages$65.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(DCDPackageList$getPackages$66.INSTANCE, DCDPackageList$getPackages$67.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(null, DCDPackageList$getPackages$68.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModuleWithViewManager(null, DCDPackageList$getPackages$69.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNAppIconManager", DCDPackageList$getPackages$70.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNAudioRouteEmitter", DCDPackageList$getPackages$71.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNDeviceManager", DCDPackageList$getPackages$72.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNDeviceLocaleManager", DCDPackageList$getPackages$73.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNDevicePerformanceManager", DCDPackageList$getPackages$74.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNFileManager", DCDPackageList$getPackages$75.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNClientInfoManager", DCDPackageList$getPackages$76.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNKeyboardManager", DCDPackageList$getPackages$77.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNHeartbeatKeyProvider", DCDPackageList$getPackages$78.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNThemeManager", DCDPackageList$getPackages$79.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNMobileVoiceOverlay", DCDPackageList$getPackages$80.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("TimersModule", DCDPackageList$getPackages$81.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule("RTNSavedAppConstants", DCDPackageList$getPackages$82.INSTANCE));
        q.g(packages, "packages");
        return packages;
    }
}
