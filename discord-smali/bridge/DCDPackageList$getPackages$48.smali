.class final synthetic Lcom/discord/bridge/DCDPackageList$getPackages$48;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/bridge/DCDPackageList;->getPackages()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "Lcom/discord/password_manager/smartlock/SmartLockModule;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$48;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/bridge/DCDPackageList$getPackages$48;

    invoke-direct {v0}, Lcom/discord/bridge/DCDPackageList$getPackages$48;-><init>()V

    sput-object v0, Lcom/discord/bridge/DCDPackageList$getPackages$48;->INSTANCE:Lcom/discord/bridge/DCDPackageList$getPackages$48;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const-class v2, Lcom/discord/password_manager/smartlock/SmartLockModule;

    const-string v3, "<init>"

    const-string v4, "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/n;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/discord/password_manager/smartlock/SmartLockModule;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/discord/password_manager/smartlock/SmartLockModule;

    invoke-direct {v0, p1}, Lcom/discord/password_manager/smartlock/SmartLockModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p0, p1}, Lcom/discord/bridge/DCDPackageList$getPackages$48;->invoke(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/discord/password_manager/smartlock/SmartLockModule;

    move-result-object p1

    return-object p1
.end method
