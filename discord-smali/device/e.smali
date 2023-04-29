.class public final synthetic Lcom/discord/device/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/PowerManager$OnThermalStatusChangedListener;


# instance fields
.field public final synthetic a:Lcom/discord/device/DeviceThermalStateManagerModule;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/device/DeviceThermalStateManagerModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/device/e;->a:Lcom/discord/device/DeviceThermalStateManagerModule;

    return-void
.end method


# virtual methods
.method public final onThermalStatusChanged(I)V
    .locals 1

    iget-object v0, p0, Lcom/discord/device/e;->a:Lcom/discord/device/DeviceThermalStateManagerModule;

    invoke-static {v0, p1}, Lcom/discord/device/DeviceThermalStateManagerModule;->a(Lcom/discord/device/DeviceThermalStateManagerModule;I)V

    return-void
.end method
