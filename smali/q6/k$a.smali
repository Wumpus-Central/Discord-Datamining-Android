.class final Lq6/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lq6/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq6/k;

    invoke-direct {v0}, Lq6/k;-><init>()V

    sput-object v0, Lq6/k$a;->a:Lq6/k;

    return-void
.end method

.method static synthetic a()Lq6/k;
    .locals 1

    sget-object v0, Lq6/k$a;->a:Lq6/k;

    return-object v0
.end method
