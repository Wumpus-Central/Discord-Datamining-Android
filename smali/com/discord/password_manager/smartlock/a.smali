.class public final synthetic Lcom/discord/password_manager/smartlock/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/d;


# instance fields
.field public final synthetic a:Lcom/discord/password_manager/smartlock/SmartLockModule;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/password_manager/smartlock/SmartLockModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/password_manager/smartlock/a;->a:Lcom/discord/password_manager/smartlock/SmartLockModule;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/password_manager/smartlock/a;->a:Lcom/discord/password_manager/smartlock/SmartLockModule;

    invoke-static {v0, p1}, Lcom/discord/password_manager/smartlock/SmartLockModule;->b(Lcom/discord/password_manager/smartlock/SmartLockModule;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
