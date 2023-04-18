.class final Lb7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lb7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb7/c;

    invoke-direct {v0}, Lb7/c;-><init>()V

    sput-object v0, Lb7/c$a;->a:Lb7/c;

    return-void
.end method

.method static synthetic a()Lb7/c;
    .locals 1

    sget-object v0, Lb7/c$a;->a:Lb7/c;

    return-object v0
.end method
