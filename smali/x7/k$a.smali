.class public interface abstract Lx7/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# static fields
.field public static final a:Lx7/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/a0$b;

    invoke-direct {v0}, Lx7/a0$b;-><init>()V

    sput-object v0, Lx7/k$a;->a:Lx7/k$a;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/media/MediaCodec;)Lx7/k;
.end method
