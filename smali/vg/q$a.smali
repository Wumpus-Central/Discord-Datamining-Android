.class public final Lvg/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lvg/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvg/q$a;

    invoke-direct {v0}, Lvg/q$a;-><init>()V

    sput-object v0, Lvg/q$a;->a:Lvg/q$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxg/c;)V
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
