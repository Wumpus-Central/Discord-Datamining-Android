.class final Lz6/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lz6/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/j;

    invoke-direct {v0}, Lz6/j;-><init>()V

    sput-object v0, Lz6/j$a;->a:Lz6/j;

    return-void
.end method

.method static synthetic a()Lz6/j;
    .locals 1

    sget-object v0, Lz6/j$a;->a:Lz6/j;

    return-object v0
.end method
