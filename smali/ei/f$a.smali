.class public final Lei/f$a;
.super Lei/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lei/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lei/f$a;

    invoke-direct {v0}, Lei/f$a;-><init>()V

    sput-object v0, Lei/f$a;->a:Lei/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lei/f;-><init>()V

    return-void
.end method
