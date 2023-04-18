.class public final synthetic Lj3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/d;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/b;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lj3/b;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lcom/discord/notifications/fcm/utils/FCMTokenHelper;->b(Lkotlin/jvm/functions/Function1;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
