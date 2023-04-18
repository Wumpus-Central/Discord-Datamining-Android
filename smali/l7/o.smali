.class public interface abstract Ll7/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll7/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll7/m;

    invoke-direct {v0}, Ll7/m;-><init>()V

    sput-object v0, Ll7/o;->a:Ll7/o;

    return-void
.end method


# virtual methods
.method public abstract a()[Ll7/i;
.end method

.method public abstract b(Landroid/net/Uri;Ljava/util/Map;)[Ll7/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Ll7/i;"
        }
    .end annotation
.end method
