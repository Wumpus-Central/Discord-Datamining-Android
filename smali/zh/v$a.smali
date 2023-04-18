.class public final Lzh/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzh/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzh/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lzh/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzh/v$a;

    invoke-direct {v0}, Lzh/v$a;-><init>()V

    sput-object v0, Lzh/v$a;->a:Lzh/v$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ldi/o0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
