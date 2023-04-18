.class Lz1/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field static final a:Lz1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lz1/g;->a()Lz1/h;

    move-result-object v0

    sput-object v0, Lz1/g$b;->a:Lz1/h;

    return-void
.end method
