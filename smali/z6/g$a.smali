.class final Lz6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lz6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/g;

    invoke-direct {v0}, Lz6/g;-><init>()V

    sput-object v0, Lz6/g$a;->a:Lz6/g;

    return-void
.end method

.method static synthetic a()Lz6/g;
    .locals 1

    sget-object v0, Lz6/g$a;->a:Lz6/g;

    return-object v0
.end method
