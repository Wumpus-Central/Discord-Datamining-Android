.class final Lz6/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lz6/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/i;

    invoke-direct {v0}, Lz6/i;-><init>()V

    sput-object v0, Lz6/i$a;->a:Lz6/i;

    return-void
.end method

.method static synthetic a()Lz6/i;
    .locals 1

    sget-object v0, Lz6/i$a;->a:Lz6/i;

    return-object v0
.end method
