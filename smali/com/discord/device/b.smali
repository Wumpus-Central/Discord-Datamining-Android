.class public final synthetic Lcom/discord/device/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/device/DeviceSettingsManagerModule;

.field public final synthetic l:Z

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lcom/discord/device/DeviceSettingsManagerModule;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/device/b;->k:Lcom/discord/device/DeviceSettingsManagerModule;

    iput-boolean p2, p0, Lcom/discord/device/b;->l:Z

    iput p3, p0, Lcom/discord/device/b;->m:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/discord/device/b;->k:Lcom/discord/device/DeviceSettingsManagerModule;

    iget-boolean v1, p0, Lcom/discord/device/b;->l:Z

    iget v2, p0, Lcom/discord/device/b;->m:I

    invoke-static {v0, v1, v2}, Lcom/discord/device/DeviceSettingsManagerModule;->a(Lcom/discord/device/DeviceSettingsManagerModule;ZI)V

    return-void
.end method
