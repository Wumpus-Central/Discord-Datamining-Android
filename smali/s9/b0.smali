.class public final synthetic Ls9/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/h;


# static fields
.field public static final synthetic a:Ls9/b0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ls9/b0;

    invoke-direct {v0}, Ls9/b0;-><init>()V

    sput-object v0, Ls9/b0;->a:Ls9/b0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p1}, Ls9/c;->b(Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
