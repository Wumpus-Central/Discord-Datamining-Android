.class public Li0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/n$b;
    }
.end annotation


# static fields
.field static final a:Li0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li0/e;

    sget-object v1, Li0/v;->g:Li0/v;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li0/e;-><init>(Li0/v;I)V

    sput-object v0, Li0/n;->a:Li0/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Li0/n$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li0/n;-><init>()V

    return-void
.end method

.method public static a(Li0/v;)Li0/n;
    .locals 2

    new-instance v0, Li0/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Li0/e;-><init>(Li0/v;I)V

    return-object v0
.end method

.method public static b(Li0/v;)Li0/n;
    .locals 2

    new-instance v0, Li0/e;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Li0/e;-><init>(Li0/v;I)V

    return-object v0
.end method
